import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern genomePattern = Pattern.compile("^([!@#$?a-z]+)=(\\d+)--(\\d+)<<([a-z]+)$");
        LinkedHashMap<String,Long> genomes = new LinkedHashMap<>();
        String input = reader.readLine();
        while(!input.equals("Stop!")){
            Matcher matcher = genomePattern.matcher(input);
            while(matcher.find()){
                String letters[] = matcher.group(1).split("[!@#$?]+");
                StringBuilder str= new StringBuilder();
                for (String letter : letters) {
                    str.append(letter);
                }
                long nameLength = Long.parseLong(matcher.group(2));
                if(str.toString().length()!=nameLength){
                    break;
                }
                long countOfGenes = Long.parseLong(matcher.group(3));
                String organism = matcher.group(4);

                if(!genomes.containsKey(organism)){
                    genomes.put(organism,0L);
                }
                genomes.put(organism,genomes.get(organism)+countOfGenes);

            }

            input = reader.readLine();
        }
        genomes.entrySet().stream().sorted((kv2,kv1)-> kv1.getValue().compareTo(kv2.getValue()))
                .forEach(kv -> System.out.printf("%s has genome size of %d%n",kv.getKey(),kv.getValue()));

    }
}







