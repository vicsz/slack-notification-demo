# Spring Boot Error Appender to Slack WebHook example

Example of sending error level log messages to a Slack WebHook.

**Note: for the Demo to work, you need to update the INSERT_YOUR_WEB_HOOK_HERE value in the logback.xml file with your Slack Incoming Webhook URL.**

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
curl -X POST --data-urlencode "payload={\"This is a line of text in a channel.\nAnd this is another line of text.\"}"" INSERT_YOUR_WEB_HOOK_URL_HERE
```

