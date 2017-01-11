# SpringCloudConsulDiscoveryClientB

Тестовое приложение, использующее в качестве **Service Discovery** сервер [Consul](https://www.consul.io).
Вызывает посредством [Feign](https://github.com/OpenFeign/feign) сервис [spring-cloud-consul-discovery-client-a](https://github.com/risbarov/spring-cloud-consul-discovery-client-a), зарегистрированный в **Consul**.

# Consul Service Discovery

Для запуска сервера Consul Service Discovery необходимо выполнить:

`./consul agent -server -bootstrap -ui -data-dir=/tmp/consul`
