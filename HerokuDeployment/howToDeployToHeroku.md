#How to deploy a Java app to Heroku:

####In Eclipse:

- right click on the project folder; select `configure/Convert to Maven Project` and click `finish`;

- right click on the project folder again; select `Export/WAR File`, browse a destination for the file and un-tick `Optimize for a specific server runtime` and click `finish`.

####In the Terminal:

First of all make sure you have the `Heroku Toolbelt` installed:

```shell
  $ heroku plugins:install https://github.com/heroku/heroku-deploy
```

then login to heroku:
```shell
  $ heroku login
  # Enter your Heroku credentials.
```

create a new heroku app:
```shell
  $ heroku create <heroku-app-name>
```

and deploy:
```shell
  $ heroku deploy:war --war <path_to_war_file> --app <heroku-app-name>
```
