                                 ## LAB 6
## Question
Create a Student class, that will store the details of the Student, below mentioned are the attributes of a student.
Reg. No.
Name
Email
Phone
Class
Department
The Student class will have the following methods:
A constructor to initialize the values of the Student
A method to print the Details of the Student.
A method (named 'toString()) that convert the student details to string, and can be used to write the student details to file.
In the main-method class, create an array of Student Class to hold maximum details of 100 Students.

In the menu-driven program, the menu options will have
Add a student
Adds the details of 1 student to the array of Student.
Search for a student
Search for the details of a student from the array of Student.
Searching can be done with Name or Register Number.
Update the details of a student
Update the student details based on the search based on name or register number.
Display all students
Displays the details of all students.
Save the details of each student in a file, with the student name as filename.

## SOLUTION
1. Create a Student class with the given attributes and methods.
2. Create a main method to implement the menu-driven program.
3. In the main method, create an array of Student Class to hold maximum details of 100 Students.
4. For adding a student, enter the student details and add them to the array of Student.
5. For searching a student enter the name or register number of the student, and search the array of Student.
6. For updating the details of a student enter the name or register number of the student, and update the details.
7. Display the details of each student.

## FLOWCHART
![image](https://github.com/nithin403/22122033-MDS273L-JAVA/assets/113897873/a0deecf3-8fb5-4ade-83be-306b984d26eb)

## OUTPUT
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 1
Enter the details of the student:
Reg No.: 22122033

Name: Nithin
Email: nithinns403@gmail.com
Phone: 9074983220
Class: mscds A
Department: Data science
Student added successfully
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 1
Enter the details of the student:
Reg No.: 22122034

Name: Arjun
Email: arjun123@gmail.com
Phone: 9645368846
Class: mscds B
Department: Data science
Student added successfully
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 2
Enter the search term (name or register number):
Nithin
Reg No.: 22122033
Name: Nithin
Email: nithinns403@gmail.com
Phone: 9074983220
Class: mscds A
Department: Data science
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 3
Enter the search term (name or register number):
Nithin
Enter the new details:
Name: Vishal
Email: vishal123@gmail.com
Phone: 9048630132
Class: Bca
Department: Computer science
Student details updated successfully
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 4
Reg No.: 22122033
Name: Vishal
Email: vishal123@gmail.com
Phone: 9048630132
Class: Bca
Department: Computer science
Reg No.: 22122034
Name: Arjun
Email: arjun123@gmail.com
Phone: 9645368846
Class: mscds B
Department: Data science
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 5
Enter the name of the student to save the details to file:
Arjun
Student details saved to file successfully
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 6
Exiting...
