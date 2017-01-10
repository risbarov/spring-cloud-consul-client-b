# SpringCloudConsulDiscoveryClientB

Тестовое приложение, использующее в качестве **Service Discovery** сервер [Consul](https://www.consul.io).
Вызывает посредством **Feign** сервис **spring-cloud-consul-discovery-client-a**, зарегистрированный в **Consul**.

# Consul Service Discovery

Для запуска сервера Consul Service Discovery необходимо выполнить:

`./consul agent -server -bootstrap -data-dir=/tmp/consul`
