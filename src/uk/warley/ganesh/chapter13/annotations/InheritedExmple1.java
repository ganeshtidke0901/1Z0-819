package uk.warley.ganesh.chapter13.annotations;

import java.lang.annotation.Inherited;

@Inherited
@interface Vertebrate {
}


@Vertebrate
class Hello{}

public class InheritedExmple1 extends Hello{

}
