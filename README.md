# Buttons Demo

buttonsdemo-melvincabatuan created by Classroom for GitHub

This assignment illustrates the 3 main button handling methods in Android. 


## Accept

To accept the assignment, click the following URL:

https://classroom.github.com/assignment-invitations/93f2a808082bf38d7ed91f5e344c3de5

## Sample Solution:

https://github.com/DeLaSalleUniversity-Manila/buttonsdemo-melvincabatuan

## Keypoints:

* "xml onClick" method:
```xml
android:onClick="onClickImageButton"
```

```Java
    // Handle imageButton
    public void onClickImageButton(View view){
        Toast.makeText(getBaseContext(), "imageButton was clicked!",
                Toast.LENGTH_SHORT).show();
    }
```

* "Button instantiation - setOnClickListener()"  method:
```Java
   // Handle the first image text button
        Button image_btn1 = (Button) findViewById(R.id.imageTextButton1);
        image_btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "imageTextButton1 was clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });
```

* "Button instantiation - anonymous OnClickListener class" method:
```Java
 // Button handling with anonymous class for the rest
        Button image_btn2 = (Button) findViewById(R.id.imageTextButton2);
        image_btn2.setOnClickListener(btnListener);

        Button image_btn3 = (Button) findViewById(R.id.imageTextButton3);
        image_btn3.setOnClickListener(btnListener);

        Button image_btn4 = (Button) findViewById(R.id.imageTextButton4);
        image_btn4.setOnClickListener(btnListener);
        
        ...
        
        private View.OnClickListener btnListener = new View.OnClickListener() {
        public void onClick(View view)
        {
            Toast.makeText(getBaseContext(),
                    ((Button) view).getText() + " was clicked!",
                    Toast.LENGTH_LONG).show();
        }
    };
```



## Submission Procedure with Git: 

```shell
$ cd /path/to/your/android/app/
$ git init
$ git add –all
$ git commit -m "your message, e.x. Assignment 1 submission"
$ git remote add origin <Assignment link copied from assignment github, e.x. https://github.com/DeLaSalleUniversity-Manila/secondactivityassignment-melvincabatuan.git>
$ git push -u origin master
<then Enter Username and Password>
```


## Screenshot:

![alt tag](https://github.com/DeLaSalleUniversity-Manila/buttonsdemo-melvincabatuan/blob/master/device-2015-10-09-104513.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/buttonsdemo-melvincabatuan/blob/master/device-2015-10-09-104531.png)

"*I doubt, therefore... I might be.*" - Anonymous 
