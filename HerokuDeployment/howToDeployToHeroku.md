#How to deploy a Java app to Heroku:

####In Eclipse:

- right click on the project folder. Select `configure/Convert to Maven Project` and click `finish`;

- right click on the project folder again. Select `Export/WAR File`, browse a destination for the file, un-tick `Optimize for a specific server runtime` and click `finish`.

####In the Terminal:

First of all make sure you have the [Heroku Toolbelt](https://toolbelt.heroku.com/) installed and then run:

```shell
  $ heroku plugins:install https://github.com/heroku/heroku-deploy
```
to install the plugin for deploying WAR files.

Login to Heroku:
```shell
  $ heroku login
  # Enter your Heroku credentials.
```

create a new Heroku app:
```shell
  $ heroku create <heroku-app-name>
```

and deploy:
```shell
  $ heroku deploy:war --war <path_to_war_file> --app <heroku-app-name>
```
