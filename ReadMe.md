Appota Android SDK for Advertiser
===============
This SDK is used to measure the effectiveness of your ads install and app engagement campaigns--by tracking the installs and user activity that were driven by your advertising on `ADSOTA`

## 1. Import SDK:

- Copy library AppotaAdvertiserSDK.jar to libs folder in your project.

	If you're using Android Studio add config to build.gradle like below:

	`dependencies {`

    ...
	
    **compile files('libs/AppotaAdvertiserSDK.jar')**
	
	...
	
	`}`

## 2. Configure AndroidManifest.xml

- Declare Appota API Key (`Appota API Key` can be retreived from Appota developer page):

		In application tag, add Appota API Key
		
        <meta-data
            android:name="com.appota.apiKey"
            android:value="your_appota_apikey" />


- Add permissions:

	`<uses-permission android:name="android.permission.INTERNET" />`
    `<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />`

## 2. Function

- Call AppotaAdvertiserSDK.configure(activity);