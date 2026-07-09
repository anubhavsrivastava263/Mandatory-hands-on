
DECLARE
    num NUMBER := 10;
BEGIN
    IF num > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Positive');
    ELSIF num = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Zero');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Negative');
    END IF;
END;
/

BEGIN
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(i);
    END LOOP;
END;
/
