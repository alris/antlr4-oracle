CREATE OR REPLACE PACKAGE BODY scott.pkg2
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

   PROCEDURE p3
   IS
   BEGIN
      p2;
   END;

   PROCEDURE p_call_pkg1
   IS
   BEGIN
      pkg1.p1;
      pkg1.p_call_p1and2;
   END;
END;
/