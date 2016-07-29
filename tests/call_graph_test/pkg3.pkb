CREATE OR REPLACE PACKAGE BODY scott.pkg3
AS
   PROCEDURE internal_p1
   IS
   BEGIN
      NULL;
   END;
   
   PROCEDURE p1
   IS
   BEGIN
      internal_p1;
   END;

   PROCEDURE p2
   IS
   BEGIN
      p1;
   END;

   PROCEDURE p_call_pkg1
   IS
   BEGIN
      pkg1.p1;
      pkg1.p_call_p1and2;
   END;

   PROCEDURE p_call_pkg2
   IS
   BEGIN
      pkg2.p1;
      pkg2.p_call_pkg1;
   END;
END;
/