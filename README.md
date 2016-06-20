# ActivityLifecycle
ActivityLifeCycle with different case study.

####Case 1 = First click the app icon

#####Note : here does not show the onRestoreInstanceState because it execute on runtime

I/State changed: onCreate: 

I/State changed: onStart: 

I/State changed: onResume: 


####Case 2 = Click Home Button (same happended when screen light off or coming call)

I/State changed: onPause: 

I/State changed: onSaveInstanceState:

I/State changed: onStop:


####Case 3 = (case 2 continue) Open App via Recent

I/State changed: onRestart: 

I/State changed: onStart: 

I/State changed: onResume:

####Case 4 = Click Back button (onBackPressed method call)

I/State changed: onPause: 

I/State changed: onStop: 

I/State changed: onDestroy: 


####Case 5 = Configration Change (Rotate the screen)

I/State changed: onPause: 

I/State changed: onSaveInstanceState: 

I/State changed: onStop:

I/State changed: onDestroy:

I/State changed: onCreate: 

I/State changed: onStart: 

I/State changed: onRestoreInstanceState: 

I/State changed: onResume:

####Case 6 = open dialog in activity (Assuming)

I/State changed: onPause: 

####Case 7 =  close dialog in activity (Assuming)

I/State changed: onResume:
