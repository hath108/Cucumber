Feature: Возможности
  Остальные возможности

  @otladish
  Scenario: Проверка возможностей
    Given вывести список
      |Файл         |
      |Редактировать|
      |Изменить     |
    Then вывести таблицу
      |Файл         |true |
      |Редактировать|false|
      |Изменить     |true |
    Then вывести название доступных пунктов
      |Название     |Доступен |Количество подменю      |
      |Файл         |true     |2                       |
      |Редактировать|false    |6                       |
      |Изменить     |true     |99                      |