# Hello World API

## Introduction

This README provides instructions for setting up and deploying the "Hello World API" on Oracle WebLogic Server 12c. The API returns a JSON-formatted greeting.

## Prerequisites

- Linux-based system
- Oracle JDK 8 or later
- Maven 3.x
- Access to Oracle WebLogic Server 12c installation files

## Installation Steps

### Install Oracle WebLogic Server 12c

1. **Download WebLogic 12c**: Visit the Oracle Technology Network to download the WebLogic Server 12c installer.

2. **Install WebLogic**:
    - Change to the directory where you downloaded the installer.
    - Make the installer executable:
      ```
      chmod +x fmw_12.2.1.3.0_wls_Disk1_1of1_64bit.bin
      ```
    - Run the installer:
      ```
      ./fmw_12.2.1.3.0_wls_Disk1_1of1_64bit.bin
      ```
    - Follow the on-screen instructions to complete the installation.

### Create a WebLogic Domain

1. **Set the WebLogic environment**:

source /path/to/weblogic/oracle_home/wlserver/server/bin/setWLSEnv.sh

2. **Run the Configuration Wizard**:

3. **Follow the Wizard for Domain Creation**:
- Choose "Create a new domain".
- In the templates section, select "Basic WebLogic Server Domain".
- Configure administrative username and password.
- Define your domain's directory and name.
- Proceed to create the domain.

## Build the Application

1. **Navigate to the Project Directory**:

cd /path/to/hello-world-api


2. **Build the project**:

mvn clean install


## Deploy the Application to WebLogic

1. **Start WebLogic Server**:
   /path/to/domain/startWebLogic.sh


2. **Access WebLogic Administrative Console**:
- Open a web browser and go to `http://localhost:7001/console`.
- Log in with your administrative username and password.

3. **Deploy the Application**:
- In the console, go to "Deployments".
- Click "Install" and upload the WAR file from `target/hello-world-api.war`.
- Follow the prompts to target your server (usually "AdminServer") and activate the changes.

## Testing the Service

To test the Hello World API, use any web browser or a tool like curl:

curl http://localhost:7001/hello-world-api/api/hello


You should receive a response similar to:

{
"message": "Hello, World!"
}