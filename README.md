# Java Assignment Semester Two, Year One
A program is required which will enable a university lecturer (the user) to maintain a list of
student id numbers and marks for his/her module. The program shall assume that marks for
students are stored in a CSV file. The program shall read in the existing marks, display
these to the user and allow him/her to add new marks, edit existing marks and delete
existing marks. When finished the program shall allow the user to save these marks back to
the CSV file. The program shall also enable the generation of simple statistics for the
module.

Specific requirements are as follows:
  1. Marks File
    The marks file consists of two fields, student id number and module mark, as follows:
    B00123,55
    B00783,35
    B00898,67
  2. The program shall enable the display of a full list of student id numbers and module
    marks to the user.
  3. The program shall allow the user to enter a new record in the marks file, prompting
    the user to enter a student id and module mark.
    Student id number should be exactly six characters in length. Module mark should
    be a whole number in the range 0-100. The program should confirm to the user
    when a mark has been successfully entered.
  4. The program shall allow the user to edit an existing mark. The program should
    confirm to the user when a mark has been successfully updated.
  5. The program shall allow a user to delete an existing mark. This will lead to the
    deletion of the full record of student id and mark. The program should confirm to the
    user when a mark entry has been successfully deleted.
  6. The program shall also enable the user to generate simple statistics for the module,
    such as number of students in the file, average mark, maximum mark and minimum
    mark.
  7. The program shall allow the user to save all edits from the current session to file in
    CSV format as above.
Other assignment requirements:
  The adoption of object-oriented principles should be evident in your implementation
  of the above requirements.
  A structured approach to testing should be evidenced by submission of a test plan
  and outcomes in accordance with the above requirements.
