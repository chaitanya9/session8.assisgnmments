package com.example.concatudf;

import org.apache.hadoop.hive.ql.exec.UDF;
import java.util.ArrayList;
import java.util.stream.Collectors;

/*class concatstrudf extends UDF function and provides evaluate function */
public class ConcatStrUDF extends UDF{
	/* evaluate method to concatenate strings from array list with delimiter specified as first argument*/
	/* arguments: 1. SEP -delimiter 2. Arraylist - having strings for concatenation*/
	/* ReturnType: string - string having concatenated string */
	public String evaluate(String SEP, ArrayList<String> StrList){
		/* returns concatenated string*/
		return StrList.stream().map(u->u.toString()).collect(Collectors.joining(SEP));       
    }

}
