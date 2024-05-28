# Weather_Monitor
It is using monitors to signal the current weather status:

• a green monitor in case everything looks fine

• a red monitor in case of problems

## Description
A REST-based server in Java (using SpringBoot).

The service is able to manage a centrally stored weather status and is capable of:

• resetting the status

• setting it to a specific status

• delivering the status to the clients using REST.

It is using a web frontend which is capable of querying the status every 5 seconds.

## Help

Any advice for common problems or issues.

For status updates, try:
```
localhost:8080/api/monitoring/(your Message)
```
Then open Web
```
http://localhost:63342/WeatherMonitor/src/main/resources/templates/theme.html?_ijt=uqdmgt1pat0k3dbbmoep4a6jd&_ij_reload=RELOAD_ON_SAVE
```
and your status will be shown :)

## Authors

Contributors' names and contact info

Aden Ali (ww23e022@technikum-wien.at)
-
Nadine-Ann Villaluz (ww23e017@technikum-wien.at)
-
Betül Yigit (ww23e020@technikum-wien.at)
-

## Version History

* 0.1
    * Initial Commit
* 1.0
    * Added Features
    * Bugs fixed

* 1.1.1
    * Added controller
    * Bugs fixed

* 1.1.2
    * Frontend change
    * Bugs fixed
    

## License

This project is licensed under the MIT License - see the LICENSE.md file for details

## Acknowledgments

Inspiration, code snippets, etc.
* [awesome-readme](https://github.com/matiassingers/awesome-readme)
* [PurpleBooth](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2)
* [dbader](https://github.com/dbader/readme-template)
* [zenorocha](https://gist.github.com/zenorocha/4526327)
* [fvcproductions](https://gist.github.com/fvcproductions/1bfc2d4aecb01a834b46)
