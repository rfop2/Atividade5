package br.ufpe.cin.if688.minijava.exceptions;

import br.ufpe.cin.if688.minijava.ast.*;

public class PrintException {
    // BuildSymbolTableVisitor
    public static void duplicateClass(String className) {
        System.out.println("The class '" + className + "' was already declared!");
        System.exit(0);
    }
    public static void duplicateVariable(String variableName) {
        System.out.println("The variable '" + variableName + "' was already declared!");
        System.exit(0);
    }
    public static void duplicateMethod(String methodName) {
        System.out.println("The method '" + methodName + "' was already declared!");
        System.exit(0);

    }
    public static void duplicateParameter(String parameterName) {
        System.out.println("The parameter '" + parameterName + "' was already declared!");
        System.exit(0);
    }
    public static void methodDeclarationOutsideOfClass(String methodName) {
        System.out.println("Method '" + methodName + "'can't be declared outside a class!");
        System.exit(0);
    }

    // TypeCheckVisitor exceptions
    public static void typeMatch(Type expectedType, Type actualType) {
        String expected = removePrefix(expectedType.toString(), "br.ufpe.cin.if688.minijava.ast.");
        expected = expected.substring(0, expected.lastIndexOf("@"));

        String actual = removePrefix(actualType.toString(), "br.ufpe.cin.if688.minijava.ast.");
        actual = actual.substring(0, actual.lastIndexOf("@"));

        System.out.println("Couldn't match expected type '" + expected + "' with actual type '" + actual + "'");
        System.exit(0);
    }
    public static void tooManyArguments(String methodName) {
        System.out.println("Method '" + methodName + "' call has too many arguments");
        System.exit(0);

    }
    public static void tooFewArguments(String methodName) {
        System.out.println("Method '" + methodName + "' call has too few arguments");
        System.exit(0);
    }
    public static void idNotFound(String id) {
        System.out.println("Identifier '" + id + "' could not be found");
        System.exit(0);
    }

    // Auxxiliar function
    public static String removePrefix(String s, String prefix) {
        if (s != null && s.startsWith(prefix)) {
            return s.split(prefix)[1];
        }
        return s;
    }
}