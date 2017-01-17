# SpringCloudConsulClientB

Тестовое приложение, использующее в качестве **Config Server** и **Service Discovery** сервер [Consul](https://www.consul.io).
Вызывает посредством [Feign](https://github.com/OpenFeign/feign) сервис [spring-cloud-consul-client-a](https://github.com/risbarov/spring-cloud-consul-client-a), зарегистрированный в **Consul**.

# Consul Server

Для запуска сервера Consul необходимо выполнить:

`./consul agent -server -bootstrap -ui -data-dir=/tmp/consul`
