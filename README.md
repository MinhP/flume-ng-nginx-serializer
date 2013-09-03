Flume-ng Nginx Timestamp Interceptor Serializer
===============================================

This project is a quick serializer I wrote to convert a nginx timestamp to something Flume-ng can use.

Configuration
-----------
agent.sources.r1.interceptors.nginxlog.type = regex_extractor
agent.sources.r1.interceptors.nginxlog.regex = nginx: [^ ]* [\\d.]+ ([\\d]+.\\d\\d\\d) .+ (Horrible regex, modify it to match the nginx timestamp)
agent.sources.r1.interceptors.nginxlog.serializers = timestamp
agent.sources.r1.interceptors.nginxlog.serializers.timestamp.type = com.onescreen.flume.interceptor.RegexExtractorInterceptorNginxMsecToMillisSerializer
agent.sources.r1.interceptors.nginxlog.serializers.timestamp.name = timestamp

Notes
---------
Use at your own risk.
