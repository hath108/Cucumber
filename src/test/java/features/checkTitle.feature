Feature: Проверка возможностей
  Проверяем тайтл этой фичей

  @otladish
  Scenario: Title равен Bell Integrator
    Given прейти на сайт 'http://bellintegrator.ru/'
    Then тайтл равен 'Bell Integrator'
    Then закончить работу