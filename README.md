

disclaimer: I've not implemented all specializations for the programmes in the xmi file. The model could have been further improved by adding a functionality so that specialization could include other specializations. So that specialization:software could contain specialization:software engineering

Ive improved the model from excercise 1 by:

Removing the mandatoryOrNot EClass which caused me to have to create a new EObject for every course. This was replaced by adding a courseSlot which contains a eReference list for electiveCourses and a eReference container for mandatoryCourse. I also implemented an aql constraint that checks if the boolean elective is true that there are no course in mandatoryCourse, and if false that there are no courses in electiveCourses. The totalPointsMustBeMoreThan30 for a semester constraint was removed from aql and implemented in java.

I removed alot of references which were not used.

I added the datatype FallOrSpring for semester.

Launch:

Run generate.mtl with the follwing run configurations:
Project: org.eclipse.acceleo.module.sample 
Main Class: org.eclipse.acceleo.module.sample.main.Generate 
Model: /org.study/model/Department.xmi 
Target: /org.eclipse.acceleo.module.sample/target

The .html file can be found in org.eclipse.acceleo.sample/target
