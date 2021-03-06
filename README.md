# NumberPassword
数字密码UI

引入：
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```
	dependencies {
	        implementation 'com.github.ITAnt:NumberPassword:02cdd5a065'
	}

```

简单使用：
```
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/darker_gray"
    android:padding="16dp">


    <com.itant.npassword.NumberPassword
        android:id="@+id/np_test"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
</FrameLayout>

```

自定义：
```
<com.itant.npassword.NumberPassword
		android:id="@+id/np_test"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:frame_background="@color/colorPrimary"
        app:max_length="5"
        app:indicator="@android:color/white"
        app:frame_height="16dp"/>
```

监听：
```
NNumberPassword np_test = findViewById(R.id.np_test);
        np_test.setOnPasswordChangeListener(new OnPasswordChangeListener() {
            @Override
            public void onPasswordChange(String currentPasswordText, int maxPasswordLength) {
                if (!TextUtils.isEmpty(currentPassword) && currentPassword.length() == maxPasswordLength) {
		    if (TextUtils.equals(currentPassword, "123456")) {
			startActivity(new Intent(this, MainActivity.class));
			finish();
		    } else {
			ToastTool.showShort(this, "Wrong password");
		    }
        	}
            }
        });
```

![demo](https://raw.githubusercontent.com/ITAnt/NumberPassword/master/shot/sample.png)
