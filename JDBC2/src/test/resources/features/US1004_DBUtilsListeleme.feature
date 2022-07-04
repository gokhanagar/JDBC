Feature: US1004 Kullanici istenen tablodaki istenen field'i listeleyebilir

  Scenario: TC03 Kullanici istenen degeri test edebilmeli

    Given kullanici DBUtils ile HMC veri tabanina baglanir
    And kullanici DBUtils ile "tHOTEL" tablosundaki "Email" verilerini alir
    And kullanici DBUtils ile "Email" sutunundaki verileri okur
    Then DBUtil ile tum "Email" degerlerini sira numarasi ile yazdirir


























