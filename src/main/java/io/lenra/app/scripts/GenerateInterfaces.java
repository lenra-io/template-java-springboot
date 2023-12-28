// package io.lenra.app.scripts;

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;

// import com.google.gson.Gson;
// import com.google.gson.JsonObject;
// import com.google.gson.JsonSyntaxException;

// public class GenerateInterfaces {
//     public static void main(String[] args) throws JsonSyntaxException, IOException {
//         generateInterfaces(args[0], args[1]);
//     }

//     private static void generateInterfaces(String schemaPath, String outputPath) throws JsonSyntaxException, IOException {
//         Path _schemaPath = Paths.get("api", schemaPath);
//         Path _outputPath = Paths.get("gen", outputPath);

//         Gson gson = new Gson();
//         JsonObject schema = gson.fromJson(Files.readString(_schemaPath), JsonObject.class);

//         // TODO: Compile the schema into a Java file 

        
//         // TODO: Write the Java file to the output path
//     }
// }
