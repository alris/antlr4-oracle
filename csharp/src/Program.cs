using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

using Antlr4.Runtime.Atn;
using System.Runtime.CompilerServices;

namespace analyzer
{
	class Program
	{
		public static void analyze(TextReader file) {
			var input = new AntlrInputStream(file);
			var lexer = new PlSqlLexer(input);
			var tokens = new CommonTokenStream(lexer);
			var parser = new PlSqlParser(tokens);
			var tree = parser.sql_script();
		}
		
		public static void Main(string[] args)
		{
			string inputFile = null;
			
			if (args.Length > 0) {
				inputFile = args[0];
				Console.WriteLine("Parsing " + inputFile);
			}
			var istream = System.Console.In;
			
			if (inputFile != null) {
				istream = File.OpenText(inputFile);
			}
			
			analyze(istream);
		}
	}
}