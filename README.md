# MAD_practical5_21012011002

AIM: What is Intent? Write down types of Intent and types of Intent Action. Create an application which demonstrates implicit Intent for following features. 

ansswer :

An Intent is a messaging object you can use to request an action from another app component. Although intents facilitate communication between components in several ways, there are three fundamental use cases:

Starting an activity : 

An Activity represents a single screen in an app. You can start a new instance of an Activity by passing an Intent to startActivity(). The Intent describes the activity to start and carries any necessary data.

If you want to receive a result from the activity when it finishes, call startActivityForResult(). Your activity receives the result as a separate Intent object in your activity's onActivityResult() callback. For more information, see the Activities guide.

Starting a service :

A Service is a component that performs operations in the background without a user interface. With Android 5.0 (API level 21) and later, you can start a service with JobScheduler. For more information about JobScheduler, see its API-reference documentation.

For versions earlier than Android 5.0 (API level 21), you can start a service by using methods of the Service class. You can start a service to perform a one-time operation (such as downloading a file) by passing an Intent to startService(). The Intent describes the service to start and carries any necessary data.

If the service is designed with a client-server interface, you can bind to the service from another component by passing an Intent to bindService(). For more information, see the Services guide.

Delivering a broadcast :

A broadcast is a message that any app can receive. The system delivers various broadcasts for system events, such as when the system boots up or the device starts charging. You can deliver a broadcast to other apps by passing an Intent to sendBroadcast() or sendOrderedBroadcast().

The rest of this page explains how intents work and how to use them. For related information, see Interacting with Other Apps and Sharing Content.

Intent types There are two types of intents:

Explicit intents specify which application will satisfy the intent, by supplying either the target app's package name or a fully-qualified component class name. You'll typically use an explicit intent to start a component in your own app, because you know the class name of the activity or service you want to start. For example, you might start a new activity within your app in response to a user action, or start a service to download a file in the background.

Implicit intents do not name a specific component, but instead declare a general action to perform, which allows a component from another app to handle it. For example, if you want to show the user a location on a map, you can use an implicit intent to request that another capable app show a specified location on a map.

Intent Action : An intent lets you start an activity in another app by describing an action you'd like to perform, such as "view a map" or "take a picture," in an Intent object.

Some examples of intent actions :

ACTION_ALL_APPS

List all the applications available on the device.

2 ACTION_ANSWER

Handle an incoming phone call.

3 ACTION_ATTACH_DATA

Used to indicate that some piece of data should be attached to some other place

4 ACTION_BATTERY_CHANGED

This is a sticky broadcast containing the charging state, level, and other information about the battery.

5 ACTION_BATTERY_LOW

This broadcast corresponds to the "Low battery warning" system dialog.

6 ACTION_BATTERY_OKAY

This will be sent after ACTION_BATTERY_LOW once the battery has gone back up to an okay state.

7 ACTION_BOOT_COMPLETED

This is broadcast once, after the system has finished booting.

8 ACTION_BUG_REPORT

Show activity for reporting a bug.

9 ACTION_CALL

Perform a call to someone specified by the data.

10 ACTION_CALL_BUTTON

The user pressed the "call" button to go to the dialer or other appropriate UI for placing a call.

ETC....

1. Make call to specific number

2. Open specific URL

3. Open Call Log

4. Open Gallery

5. Set Alarm

6. Open Camera

![image](https://github.com/Chintan0484/MAD_practical5_21012011002/assets/98694412/b7c7bd4b-e3cd-4da1-ab76-8cd9d6d096dc)

![image](https://github.com/Chintan0484/MAD_practical5_21012011002/assets/98694412/f16e3bad-558e-45d4-ae8b-7cfc81b33f5a)

![image](https://github.com/Chintan0484/MAD_practical5_21012011002/assets/98694412/9514f58c-b78d-4f78-abc8-601749b5143b)


![image](https://github.com/Chintan0484/MAD_practical5_21012011002/assets/98694412/b5b03beb-e8b3-47a0-a2af-a2eedb49e770)

![image](https://github.com/Chintan0484/MAD_practical5_21012011002/assets/98694412/56bdc39f-9528-44dd-96b3-67c58b2f29b8)

![image](https://github.com/Chintan0484/MAD_practical5_21012011002/assets/98694412/07c9fd46-14bf-4efd-a454-70c05635fd9d)

![image](https://github.com/Chintan0484/MAD_practical5_21012011002/assets/98694412/42666a7c-f433-4880-86a6-6919c4abdbed)

![image](https://github.com/Chintan0484/MAD_practical5_21012011002/assets/98694412/625975f7-2421-45cd-b251-2a9ec2b327ef)

