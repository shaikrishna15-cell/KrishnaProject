Feature: Verify login module

  Scenario Outline: Verifying omr login with valid credentials
    Given User is on the omrlogin page
    When user enter "<userName>" and "<password>"
    And User click the login button
    Then User should verify success message after login

    Examples:
      | userName                       | password     |
      | shaikrishna15@gmail.com | Greensabc$$$123 |

  Scenario Outline: Explore Hotel Page
    Given User is on the Explore Hotel page
    When User print Welcome username and Explore Hotels
    And select details and All room type
    Then User verify All details are filled

    Examples:
      |  |  |
      |  |  |

  Scenario Outline: verify Select Hotel page
    Given User is on the select hotel page
    When user print select hotel and all hotel names ,all hotel price without and with tax
    And select Fourth hotel from last

  Scenario Outline: veriy Book Hotel page
    Given User is on the Book hotel page
    When User print book hotel and enter  guest details "<firstName>","<lastName>","<mobileNo>","<eMail>"
    And user enter GST "<RegisterNo>","<companyName>","<companyAddr>"
    And User enter the special request "<request>"
    And User enter payment Details

    Examples:
      | firstName | lastName | mobileNo   | eMail                | RegisterNo | companyName            | companyAddr  | request     | cardNumber       | nameOnCard   | cvv |
      | Krishna   | Kumar    | 8753423987 | shaikrishna15@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | car Parking | 5555555555552222 | NithishKumar | 385 |

  Scenario Outline: verify Booking confirmation page
    Given User is on the Booking confirmation page
    When user print booking is confirmed ,order id and booked hotel name