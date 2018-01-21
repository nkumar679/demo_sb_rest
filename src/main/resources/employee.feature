Feature: The version to be retrived
  I want to use this template for my feature file
  
  Scenario: Client to call GET /customer
    When Client call /customer
    Then the employee get the status code of 200	
    And the response should contain:
    """
    {"fname":"Narender","lname":"Maurya","aadhaarNumber":"425623219580","city":"Pune"}
    """
    

  
