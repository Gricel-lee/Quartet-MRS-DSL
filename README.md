# Quartet MRS Tool
Quartet Tool for the specification of Multi-robot missions + translation into PRISM language.

The tool was tested on Eclipse Modeling Tools (EMF) Version 2020-12, Windows 10. However, instructions in the Set up section guide you to deploy Quartet on Eclipse from scratch for compatibility purposes.


# Set up

To use Quartet, you must have installed EMF and SDK (already installed for EMF). It can be installed via Help>Install New Software> EMF - Eclipse Modeling Framework SDK and the Ecore Diagram Editor (SDK).

Install the plugins Xtext and Xtend (Help> Eclipse Marketplace).


### 1 Create Ecore model

Create a new Empty EMF project.

![image](https://user-images.githubusercontent.com/63869574/157302815-76010dfd-5cc3-4748-8a54-599e32c91b28.png)

Project name: se.gu.uoy.dsl > Finish

Right click on model folder and create a new Ecore Model:

![image](https://user-images.githubusercontent.com/63869574/157302954-64ee4b16-b2e1-4cc2-ad83-f8cd034a3cb5.png)

![image](https://user-images.githubusercontent.com/63869574/157302995-35c49c86-dd84-427c-b213-3ef4b93f1a59.png)

File name: quantitativePatterns.ecore > Finish

![image](https://user-images.githubusercontent.com/63869574/157303148-d87b5443-1f5c-48d6-a9f7-ca6b67a7c945.png)

Replace this file with the one provided here.

Right click on the Ecore Model and create a new EMF Generator Model> Next > Next > Ecore model > Select the Ecore File and click Load > Next > Finish

![image](https://user-images.githubusercontent.com/63869574/157303557-c53455a1-9242-43f8-93ce-e0fbebc55e20.png)

![image](https://user-images.githubusercontent.com/63869574/157303582-9bec7d30-45da-4cf8-b034-066927108cd8.png)

![image](https://user-images.githubusercontent.com/63869574/157303629-c46f8f66-a32a-4e94-a911-956a7dfb0e36.png)

![image](https://user-images.githubusercontent.com/63869574/157303651-3ffd446b-2b8b-4c2a-9bae-269c15bfb300.png)

![image](https://user-images.githubusercontent.com/63869574/157303676-8369f471-cfd5-418e-ad95-660df05fdb02.png)

This should create some code in the "src" folder and the .genmodel. Right click at the root of the .genmodel and select Generate All.

![image](https://user-images.githubusercontent.com/63869574/157303738-2fc08257-0cf5-47e5-870c-a1571508725b.png)

It should have created:

![image](https://user-images.githubusercontent.com/63869574/157303770-a5cae357-5b30-4dd0-9d98-a9c67297117c.png)

Right click on each of the folders (plugins) and click Configure > Convert to Xtext Project

![image](https://user-images.githubusercontent.com/63869574/157303845-8cd6cb9f-80db-42c2-ad7e-1d932fd38e97.png)

### 2 Create Xtext model

Go to File > New > Other > Xtext > Xtext Project From Existing Ecore Models > Add the .genmodel and select Scenario as Entry rule > Next > Finish

![image](https://user-images.githubusercontent.com/63869574/157304022-08fef1ad-3a43-4f4f-aabd-13ee6c6224ef.png)

![image](https://user-images.githubusercontent.com/63869574/157304032-fcd42080-685c-489b-b156-6d6c54905a31.png)

It should generate 4 new plugins:

![image](https://user-images.githubusercontent.com/63869574/157304117-8c0b7fd3-b38c-4126-b9e8-8cc52e0ddc05.png)

Replace these folders with the ones provided here.

Right click on the .xtext file on the src folder (of the first plugin) > Run As > MWE2:

![image](https://user-images.githubusercontent.com/63869574/157304320-169262e6-d270-4230-89b5-a93961967b0c.png)


## Run example

Right click on the first folder (org.xtext.mydsl) > Run as > Run Configuration > Eclipse Application > Launch Runtime Eclipse

You can copy the examples provided here ```runtime-EclipseXtext/demoQuartet/Examples``` and automatically generate the Prism translation in ```runtime-EclipseXtext/demoQuartet/src-gen```

![DSLexample2_1 - Copy](https://user-images.githubusercontent.com/63869574/157305096-d1fc0e81-980a-4367-8a9a-a9f01a689621.JPG)
