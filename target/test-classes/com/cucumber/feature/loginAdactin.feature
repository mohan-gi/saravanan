Feature: Login functionality module of automation practise web page
  conatins E2E functionality such as login, add a product to card,place order, and signout

  @sce1
  Scenario: verify the user login the application with valid credentials
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons

  @sce2
  Scenario: To verify whether the check-out date field accepts a later date than checkin date.
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons
    And user enter the location of roomms
    And select the hotel types
    And user enter the room type
    And user enter the number of rooms
    And user enter the check in date
    And user enter the check out date
    And user enter the adults per room
    And user eneter the children per room
    And uset enter the submit butoon
    Then Verify that system gives an error saying ‘check-in-date should not be later than check-out-date’

  @sce3
  Scenario Outline: To verify the whether check the System should report an error message ‘Enter Valid datesin
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons
    And user enter the location of roomms
    And select the hotel types
    And user enter the room type
    And user enter the number of rooms
    And user enter the check in previes five date "<checkin>"
    And user enter the check out previes three date "<checkout>"
    And user enter the adults per room
    And user eneter the children per room
    And uset enter the submit butoon
    Then Verify that application throws error message"<checkin>","<checkout>"

    Examples: 
      | checkin    | checkout   |
      | 13/02/2019 | 15/02/2019 |

  @sce4
  Scenario Outline: Location displayed in Select Hotel should be the same as location selected in search hotel form.
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons
    And user enter the room location scenario four "<location>"
    And select the hotel types
    And user enter the room type
    And user enter the number of rooms
    And Enter check-in-date as in test data "<check-in-date>"
    And Enter check-out-date as in test data "<check-out-date>"
    And user enter the adults per room
    And user eneter the children per room in forth scenario
    And uset enter the submit butoon
    Then Verify that hotel displayed is the same as selected in search Hotel form"<location>"

    Examples: 
      | check-in-date | check-out-date | location |
      | 20/02/2019    | 21/02/2019     | Sydney   |

  @sce5
  Scenario Outline: To verify whether Check-in date and Check Out date are being displayed in Select Hotel page according to the dates selected in search Hotel.
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons
    And user enter the location of roomms
    And select the hotel types
    And user enter the room type
    And user enter the number of rooms
    And Enter check-in-date as in test data "<check-in-date>"
    And Enter check-out-date as in test data "<check-out-date>"
    And user enter the adults per room
    And user eneter the children per room in forth scenario
    And uset enter the submit butoon
    Then Check-in-date and check-outdate should be displayed according to the data entered in search hotel form."<check-in-date>","<check-out-date>"

    Examples: 
      | check-in-date | check-out-date |
      | 20/02/2019    | 21/02/2019     |

  @sce6
  Scenario Outline: To verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons
    And user enter the location of roomms
    And select the hotel types
    And user enter the room type
    And user enter the number of rooms "<room>"
    And Enter check-in-date as in test data "<check-in-date>"
    And Enter check-out-date as in test data "<check-out-date>"
    And user enter the adults per room
    And user eneter the children per room in forth scenario
    And uset enter the submit butoon
    Then No-of-rooms should be displayed and match with number of rooms in search hotel page "<room>"

    Examples: 
      | check-in-date | check-out-date | room |
      | 20/02/2019    | 21/02/2019     |    1 |

  @sce7
  Scenario Outline: To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons
    And user enter the location of roomms
    And select the hotel types
    And Verify that room type reflected is the same as selected in search hotel page. "<roomtype>"
    And user enter the number of rooms "<room>"
    And Enter check-in-date as in test data "<check-in-date>"
    And Enter check-out-date as in test data "<check-out-date>"
    And user enter the adults per room
    And user eneter the children per room in forth scenario
    And uset enter the submit butoon
    Then Room type displayed should be the same as selected in search hotel page "<roomtype>"

    Examples: 
      | check-in-date | check-out-date | room | roomtype |
      | 20/02/2019    | 21/02/2019     |    1 | Standard |

  @sce8
  Scenario Outline: To verify whether the total price (excl.GST) is calculated as “price per night * no. of nights* no of rooms”.
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons
    And user enter the location of roomms
    And select the hotel types
    And Verify that room type reflected is the same as selected in search hotel page. "<roomtype>"
    And user enter the number of rooms "<noofroom>"
    And Enter check-in-date as in test data "<check-in-date>"
    And Enter check-out-date as in test data "<check-out-date>"
    And user enter the adults per room
    And user eneter the children per room in forth scenario
    And uset enter the submit butoon
    And Select the hotel and click on continue button
    Then Verify that totalprice(excl.GST) is being calculated as (price-per-night*noof- rooms*no-of-days)"<noofroom>"

    Examples: 
      | check-in-date | check-out-date | roomtype | noofroom |
      | 20/02/2019    | 21/02/2019     | Standard |        2 |

  @sce9
  Scenario Outline: To verify when pressed, logout button logs out from the application.
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons
    And user enter the location of roomms
    And select the hotel types
    And Verify that room type reflected is the same as selected in search hotel page. "<roomtype>"
    And user enter the number of rooms "<noofroom>"
    And Enter check-in-date as in test data "<check-in-date>"
    And Enter check-out-date as in test data "<check-out-date>"
    And user enter the adults per room
    And user eneter the children per room in forth scenario
    And uset enter the submit butoon
    And Select the hotel and click on continue button
    And select the continue button
    And enter the first name
    And enter the last name
    And enter the billing address
    And enter the credit card number with 16 digit number
    And select the credit card type
    And select the expire date of month and date of year
    And enter the ccv
    And Enter the details and click on book now.
    Then Check the details, click on logout and verify we have been logged out of the application.

    Examples: 
      | check-in-date | check-out-date | roomtype | noofroom |
      | 20/02/2019    | 21/02/2019     | Standard |        2 |

  @sce11
  Scenario Outline: To check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were selected in previous screen
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons
    And user enter the location of roomms"<location>"
    And select the hotel types
    And Verify that room type reflected is the same as selected in search hotel page. "<roomtype>"
    And user enter the number of rooms "<noofroom>"
    And Enter check-in-date as in test data "<check-in-date>"
    And Enter check-out-date as in test data "<check-out-date>"
    And user enter the adults per room
    And user eneter the children per room in forth scenario
    And uset enter the submit butoon
    And Select the hotel and click on continue button
    Then  Verify that totalprice(excl.GST) is being calculated as (price-per-night*noof- rooms*no-of-days)"<location>","<roomtype>","<noofroom>","<check-in-date>","<check-out-date>"
    
    Examples: 
      | check-in-date | check-out-date | roomtype | noofroom |location|
      | 20/02/2019    | 21/02/2019     | Standard |        2 |Sydney  |
    