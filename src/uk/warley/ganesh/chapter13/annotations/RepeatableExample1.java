package uk.warley.ganesh.chapter13.annotations;

import java.lang.annotation.Repeatable;

@interface Helper {
	Annotation60[] value();
}

@Repeatable(Helper.class)
@interface Annotation60 {
	int a();
}

@Annotation60(a = 1)
@Annotation60(a = 1)
@Annotation60(a = 1)
public class RepeatableExample1 {

}

@Helper({ @Annotation60(a = 1), @Annotation60(a = 1), @Annotation60(a = 1) })
class AXA {
	
	
	
}