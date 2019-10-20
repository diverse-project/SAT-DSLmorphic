package org.xtext.example.mydsl.GJ_MC_Process;

import java.io.PrintWriter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class Sat4JCompiler {
  public static void compile(final String dimacsContent) {
    try {
      final Process process = Runtime.getRuntime().exec("ls ~/org.xtext.example.mydsl.sat.compiledsat4j");
      final int code = process.waitFor();
      if ((code != 0)) {
        Sat4JCompiler.createMavenProject();
        final String app = Sat4JCompiler.getApp();
        final String pom = Sat4JCompiler.getPom();
        final PrintWriter appWriter = new PrintWriter("~/org.xtext.example.mydsl.sat.compiledsat4j/src/main/java/org/xtext/example/mydsl/sat/App.java", "UTF-8");
        appWriter.print(app);
        final PrintWriter pomWriter = new PrintWriter("~/org.xtext.example.mydsl.sat.compiledsat4j/pom.xml", "UTF-8");
        pomWriter.print(pom);
      }
      final PrintWriter cnfWriter = new PrintWriter("~/org.xtext.example.mydsl.sat.compiledsat4j/formula.dimacs", "UTF-8");
      cnfWriter.print(dimacsContent);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void createMavenProject() {
    try {
      Runtime.getRuntime().exec("cd ~");
      final String cmd = ((("mvn -B archetype:generate " + 
        "-DgroupId=org.xtext.example.mydsl.sat ") + 
        "-DartifactId=org.xtext.example.mydsl.sat.compiledsat4j ") + 
        "-DarchetypeGroupId=org.apache.maven.archetypes ");
      Runtime.getRuntime().exec(cmd);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String getPom() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<modelVersion>4.0.0</modelVersion>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<groupId>org.xtext.example.mydsl.sat</groupId>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<artifactId>org.xtext.example.mydsl.sat.compiledsat4j</artifactId>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<packaging>jar</packaging>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<version>1.0-SNAPSHOT</version>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<name>org.xtext.example.mydsl.sat.compiledsat4j</name>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<groupId>org.sat4j</groupId>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<artifactId>org.sat4j.core</artifactId>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<version>2.3.1</version>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.append("</project>");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getApp() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.xtext.example.mydsl.sat;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.sat4j.minisat.SolverFactory");
    _builder.newLine();
    _builder.append("import org.sat4j.reader.DimacsReader");
    _builder.newLine();
    _builder.append("import org.sat4j.reader.ParseFormatException");
    _builder.newLine();
    _builder.append("import org.sat4j.specs.ContradictionException");
    _builder.newLine();
    _builder.append("import org.sat4j.specs.TimeoutException");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class App ");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void main( String[] args )");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ISolver solver = SolverFactory.newDefault();");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("solver.setTimeout(3600); // 1 hour timeout");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Reader reader = new DimacsReader(solver);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("PrintWriter out = new PrintWriter(System.out,true);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("// CNF filename is given on the command line ");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("IProblem problem = reader.parseInstance(\"~/org.xtext.example.mydsl.sat.compiledsat4j/formula.dimacs\");");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("if (problem.isSatisfiable()) {");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("System.out.println(\"Satisfiable !\");");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("reader.decode(problem.model(),out);");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("System.out.println(\"Unsatisfiable !\");");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("} catch (FileNotFoundException e) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("// TODO Auto-generated catch block");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("} catch (ParseFormatException e) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("// TODO Auto-generated catch block");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("} catch (IOException e) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("// TODO Auto-generated catch block");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("} catch (ContradictionException e) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("System.out.println(\"Unsatisfiable !\");");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("} catch (TimeoutException e) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("System.out.println(\"Timeout, sorry!\");      ");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
