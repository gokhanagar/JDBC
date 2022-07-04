Feature: US1003 kullanici dogru bilgilerle database baglanabilmeli

  Scenario: TC01 Kullanici database'deki bilgileri okur

    Given kullanici DBUtils ile HMC veri tabanina baglanir
    And kullanici DBUtils ile "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici DBUtils ile "Price" sutunundaki verileri okur
    And DBUtil ile tum "Price" degerlerini sira numarasi ile yazdirir
    Then DBUtil ile 4. "Price" in 4000 oldugunu test eder
