/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

function assessRecaptcha(obj, event) {
  event.preventDefault();
  grecaptcha.enterprise.ready(function () {
    grecaptcha.enterprise.execute(obj.getAttribute("data-sitekey"), {action: obj.getAttribute("data-action")}).then(function (token) {
      console.log(token);
      httpRequest(token, obj.getAttribute("data-action"), obj.getAttribute("data-sitekey"));
    });
  });
}


function httpRequest(token, action, sitekey) {
  var request = new XMLHttpRequest();
  request.onreadystatechange= function () {
    if (request.readyState === 4) {
      if (request.status === 0 || (request.status >= 200 && request.status < 400)) {
        json_data = JSON.parse(request.response);
        console.log(json_data);
        if (json_data["success"] === "true") {
          document.getElementById("scoreButton").innerText = json_data["data"]["score"];
          // document.getElementById("recaptcha_form").submit();
        }
      } else {
        addMessage("Got Internal error...");
        console.log(json_data["data"]["error_msg"]);
      }
    }
  };
  var url = "/create_assessment"
  var json_data = JSON.stringify({"recaptcha_cred":{ "token": token, "action": action, "sitekey": sitekey}});
  request.open("POST", url)
  request.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  request.send(json_data);
}

var verifyCallback = function(token) {
  var recaptchaDiv = document.getElementById('recaptcha_render_div');
  httpRequest(token, recaptchaDiv.getAttribute("data-action"), recaptchaDiv.getAttribute("data-sitekey"));
};


var onloadCallback = function(event) {
  event.preventDefault();
  document.getElementById('submitBtn').style.display = "none";
  recaptcha_render_div = document.getElementById('recaptcha_render_div');
  recaptcha_render_div.style.display = "block";
  grecaptcha.enterprise.render(recaptcha_render_div, {
    'sitekey' : recaptcha_render_div.getAttribute("data-sitekey"),
    'callback' : verifyCallback,
    'theme' : 'light'
  });
};


function addMessage(message) {
  var myDiv = document.createElement("div");
  myDiv.id = 'div_id';
  myDiv.innerHTML = message + "<p>";
  document.body.appendChild(myDiv);
}