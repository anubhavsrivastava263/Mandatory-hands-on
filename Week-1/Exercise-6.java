
CREATE TABLE Employee(
    empid NUMBER,
    name VARCHAR2(50),
    salary NUMBER
);

INSERT INTO Employee VALUES(101,'John',50000);

COMMIT;

CREATE OR REPLACE PROCEDURE GetSalary(
    p_empid IN NUMBER
)
IS
    v_salary NUMBER;
BEGIN
    SELECT salary
    INTO v_salary
    FROM Employee
    WHERE empid = p_empid;

    DBMS_OUTPUT.PUT_LINE('Salary = ' || v_salary);
END;
/

BEGIN
    GetSalary(101);
END;
/
