# Spring Boot Error Appender to Slack WebHook example

Example of sending error level log messages to a Slack WebHook.

**Note: for the Demo to work, you need to update the ${SLACK_INCOMING_WEB_HOOK} value in the logback.xml file with your Slack Incoming Webhook URL.**
i.e.  <webhookUri>https://hooks.slack.com/services/12312/234234234</webhookUri>

Optionally, you can set the *SLACK_INCOMING_WEB_HOOK* environment variable instead.
```sh
export SLACK_INCOMING_WEB_HOOK=https://hooks.slack.com/services/12312/234234

```
**Note: by default Slack notifications will not be sent in local (non-cloud) environments, specifically when the *cloud* SPRING_PROFILES_ACTIVE is not active.**

# Requirements

## A Slack Incoming WebHook URL to send messages to:

Steps to create:

### 1 - Login into your workspace at www.slack.com

### 2 - Browse to App Directory

### 3 - Search and Select "Incoming WebHooks"

### 4 - Select "Add Configuration"

### 5 - Create a New WebHook with your desired settings.

Note the generate URL

### 6 - Test the Webhook URL

```sh
curl -s -d "payload={\"text\":\"Test Message\"}" INSERT_YOUR_WEB_HOOK_URL_HERE
```

## To test Application locally (with Slack Notifications):

Set the SPRING_PROFILES_ACTIVE env variable to cloud.

export SPRING_PROFILES_ACTIVE=cloud

Also make sure to set the SLACK_INCOMING_WEB_HOOK variable , either via environment variable or in the logback.xml file.
