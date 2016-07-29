CREATE OR REPLACE PACKAGE BODY scott.pkg1
AS
   PROCEDURE internal_p1
   IS
      l_test   INTEGER;

      FUNCTION test_fn
         RETURN INTEGER
      IS
      BEGIN
         RETURN 0;
      END;
   BEGIN
      l_test := test_fn;
   END;

   PROCEDURE internal_p2
   IS
   BEGIN
      NULL;
   END;
      
   PROCEDURE internal_p3
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
      internal_p2;
   END;

   PROCEDURE p1and2
   IS
   BEGIN
      internal_p1;
      internal_p2;
   END;

   PROCEDURE p_call_p1and2
   IS
   BEGIN
      p1and2;
      
      internal_p3;
   END;
END;
/