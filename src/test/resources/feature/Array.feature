
@Array
Feature: User launch dsalgo application and test Array page
  
  
  Background: User logged in DsAlgo portal
  Given User signin DsAlgo Portal
  When User entered valid "Numpysdet84" ans "sdet84batch"
  And User clicked login button
  Then User redirected to login page


  @Array_02
  Scenario: User able to navigate Data Structure "Array" page
    Given User is on "homepage" after logged in
    When User select Array item from the dropdown menu
    Then User be directed to "Array" Data Structure page
    

  @Array_03
  Scenario: User is able to navigate to Array in python page
    Given  User is on "Array page" after logged in  
    When User clicks arrays in Python link
    Then User should be directed to "Arrays in Python" page
    
    
  @Array_04
  Scenario: User is able to navigate page having TryEditor from the ArrayinPython page
  Given : User is on "Arrays in Python" page after logged in
  When : User click "Try Here Button"
  Then : User should be Redirected to the page having an tryEditor with Run button to test
  
  @Array_05
  Scenario Outline: User able to run code in tryEditor for arrays in python page
  Given : User is in tryEditor page with Run button to test
  When : User enter the valid Python Code in tryeditor from sheet "<Sheetname>" and <RowNumber>
  And : User click the run button
  Then : User should presented with Run result 

 Examples:
       | Sheetname  | RowNumber |
        | Python Code| 	 1      |
        
        
  @Array_06
  Scenario Outline: User presented error message for code with invalid syntax in tryEditor for Array in Python page
  Given : User is in a page having an tryEditor with Run button to test
  When : User enter the Python Code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
  And : User click the Run button
  Then : User should be presented with the Error message 
  
  Examples:
           |Sheetname  |  RowNumber   |
           |  Python Code |  2    |
           
           
  @Array_07
  Scenario:  User able to navigate the Arrays using Last page
  Given :  User is on "Array Page " after logged in 
  When : User click Arrays Using Link List 
  Then : User should be Redirected to "Arrays Using Link" page 
  
  @Array_08
  Scenario: User able to navigate to a page having an tryEditor from Arrays Using List page 
   Given : User is on "Arrays Using List" after logged in 
   When : User clicks "Try Here" button on "Array Using List" page
   Then : User should be redirected to a page having a tryEditor with a Run button to test
   
   @Array_09
   Scenario Outline: User able to run code in tryEditors for Arrays Using List page
   Given : User is in a page having a tryeditor with a run button to test 
   When: User enter the valid pythoncode in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
   And : User clicks the Run button   
   Then : User should be presented with Run result
   
   Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   1      |
       
       
   @Array_10
   Scenario Outline: User is presented with an error message for code with invalid syntax in tryEditor for Arrays Using List page
   Given: User is in a page having a tryEditor with a Run button to test
   When : User enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
   And : User clicks on run button
   Then : User should be presented with error message 
   Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   2    |
       
       
   @Array_11
   Scenario: User able to navigate to Basic Operations in Lists page
   Given : User is in "Array Page" after logged in 
   When : User clicks Basic Operation is Lists link
   Then : User should be redirected to "Basic operationd in Lists" page
   
   @Array_12
   Scenario: User is able to navigate to a page having a tryEditor for Basic Operation in Lists page
   Given: User is on the "Basic Operation in Lists" after logged in
   When : User clicks "Try Here" button on "Basic Operation in Lists" page 
   Then : User should be redirected to a page having a tryEditor with a Run button to test
   
   @Array_13
   Scenario Outline: User is able to run code  in tryEditor Basic Operation in Lists page
   Given : User is in a page having a tryEditor with a Run button test
   When : User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
   And: User clicks on run button 
   Then : User should be presented with Run result   
   
   Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   1    |
       
  @Array_14       
  Scenario Outline: User is presented with the error message for code with invalid syntax in tryEditor for Basic Operations in Lists page 
  Given : User  is in a page having an tryEditor with Run button to test  
  When: User Enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
  And: User clicks Run button 
  Then : User should be presented with the error message 
  
   Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   2    |
       
       
    @Array_15
   Scenario: User should be able to navigate Application of Array page 
   Given : User is on Array page after logged in 
   When : User clicks Application of Array link 
   Then : User should be redirected to "Application of Array page"
   
   @Array_16      
   Scenario: User is able to navigate to a page having an tryEditor from Applications of Array page
   Given : User is on "Application of Array page" after logged in
   When : User clicks "Try Here" button
   Then : User should be redirected to a page having an tryEditor with a Run button to test
   
   @Array_17
   Scenario Outline: User is able run code in tryEditor for Applications of Array page
   Given : User is in a page having an tryEditor with a Run button to test 
   When : User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
   And: User clicks on run button 
   Then : User should be presented with Run result 
   
    Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   1    |
       
   
    @Array_18    
    Scenario Outline: User is presented with error message for code with invalid syntax in tryEditor for Applications of Array page
    Given: User is in a page having a tryEditor with run button to test
    When: User enter python code with invalid syntax in tryeditor from sheet "<Sheetname>" and "<RowNumber>"
    And : User click the run button 
    Then : User should be presented with the error message 
    
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   2   |
       
      
     @Array_19
     Scenario: User is able th navigate the poratal page 
     Given : User is on the "Array in Python" after logged in 
     When : User clicks Practice question link
     Then : User should be redirected to the practice page 
     
     @Array_20     
     Scenario: User is able to navigate Question page from search the array link 
     Given : User is on Practice page after logged in '
     When : User clicks the search the array link 
     Then : User should be redirected to the question page contains an tryEditor with Run and Submit buttons
     
     @Array_21
     Scenario Outline: User is able to Runcode in tryEditor for Search the array link
     Given: User is on "Question" page of "Search the array" after logged in 
     When : User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
     And : User clicks on run button
     Then : User should be presented with the run result 
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   3    |
       
       
     @Array_22         
     Scenario: User is able to submit code in tryEditor for Search the array link
     Given: User is on "Question" page of "Search the array" after logged in 
     When : User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
     And : User clicks on Submit button
     Then : User should be presented with Succesful submission message
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   4   |
       
       
      @Array_23
      Scenario: User is presented with error message for code with invalid syntax in tryEditor for Search the array link
      Given: User is on "Question" page of "Search the array" after logged in 
      When : User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
      And : User clicks on Run button
      Then : User should be presented with error message
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   2  |
       
       
      @Array_24
      Scenario: User is able to navigate to Question page from Max Consecutive Ones   
      Given: User is on practice page after logged in'
      When : User clicks the Max consecutive ones link
      Then : User should be redirected to the question page contains an tryEditor with Run and Submit buttons
      
     
     @Array_25         
     Scenario Outline: User able to run the code in tryeditor of Max Consecutive Ones
     Given : User is on "Question" page of "Max Consecutive Ones" after logged in
     When: User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>" for the Question
     And: User clicks Run button 
     Then : User should be presented with the run result 
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   5    |
       
   
      @Array_26
     Scenario Outline: User able to Submit the code in tryeditor of Max Consecutive Ones
     Given : User is on "Question" page of "Max Consecutive Ones" after logged in
     When: User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>" for the Question
     And: User clicks submit button 
     Then : User should be presented with the successful submission message 
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   6    |
       
       
       
     @Array_27     
     Scenario Outline: User is presented with error message for code with invalid syntax in tryEditor for Max Consecutive Ones
      Given: User is on "Question" page of "Max Consecutive Ones" after logged in 
      When : User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
      And : User clicks on Run button
      Then : User should be presented with error message
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   2  |
       
       
     @Array_28
     Scenario: User is able to navigate to Question page from Find Numbers with Even Number of Digits
     Given: User is on "Practice Page" after logged in
     When: User clicks the Find Numbers with Even Number of Digits
     Then : User should be redirected to the question page contains an tryEditor with Run and Submit buttons
     
     
     
     @Array_29    
     Scenario Outline: User able to run the code in tryeditor of Find Numbers with Even Number of Digits
     Given : User is on "Question" page of "Find Numbers with Even Number of Digits" after logged in
     When: User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>" for the Question
     And: User clicks Run button 
     Then : User should be presented with the run result 
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   7     |
       
       
       
     @Array_30
     Scenario Outline: User able to Submit the code in tryeditor of Find Numbers with Even Number of Digits
     Given : User is on "Question" page of "Find Numbers with Even Number of Digits" after logged in
     When: User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>" for the Question
     And: User clicks submit button 
     Then : User should be presented with the successful submission message 
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   8   |
       
     
     @Array_31      
     Scenario Outline: User is presented with error message for code with invalid syntax in tryEditor for Find Numbers with Even Number of Digits
      Given: User is on "Question" page of "Find Numbers with Even Number of Digits" after logged in 
      When : User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
      And : User clicks on Run button
      Then : User should be presented with error message
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   2  |
       
       
       
     @Array_32
      Scenario: User is able to navigate to Question page from Squares of a Sorted Array
     Given: User is on "Practice Page" after logged in
     When: User clicks the Squares of a Sorted Array
     Then : User should be redirected to the question page contains an tryEditor with Run and Submit buttons
     
      
       
    @Array_33  
   Scenario Outline: User able to run the code in tryeditor of Squares of a Sorted Array
     Given : User is on "Question" page of "Squares of a Sorted Array" after logged in
     When: User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>" for the Question
     And: User clicks Run button 
     Then : User should be presented with the run result 
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   9    |
       
       
    @Array_34
    Scenario Outline: User able to Submit the code in tryeditor of  Squares of a Sorted Array
     Given : User is on "Question" page of " Squares of a Sorted Array" after logged in
     When: User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>" for the Question
     And: User clicks submit button 
     Then : User should be presented with the successful submission message 
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   10   |
       
       
       
     @Array_35
     Scenario Outline: User is presented with error message for code with invalid syntax in tryEditor for Squares of a Sorted Array
      Given: User is on "Question" page of "Squares of a Sorted Array" after logged in 
      When : User enter valid python code in tryEditor from sheet "<Sheetname>" and "<RowNumber>"
      And : User clicks on Run button
      Then : User should be presented with error message
     
     Examples: 
       | Sheetname  |  RowNumber |
       | pythonCode  |   2  |
       
       

  
       
   
    
       

           

  
        
        

    
