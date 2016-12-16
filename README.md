# react-native-connected-common

Library of commonly used classes for React Native by [Connected Lab](http://connectedlab.com/)

## Build Instructions

```
# Required so that xcode project can find React dependencies. 
# Android works fine without it because it has gradle dependencies.
npm install react-native
npm install react
```

# Build Instructions

## React Native

-1\. [Install brew](http://brew.sh/) if not already installed.
```shell
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
# If brew doctor complains about permissions try
sudo chown -R $(whoami) /usr/local
```

0\. [Install node ](https://www.sitepoint.com/quick-tip-installing-react-native/) if not already installed.
```shell
curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.30.2/install.sh | bash
# Close and restart terminal
nvm install node && nvm alias default node
```
1\. [Install react-native](https://www.sitepoint.com/quick-tip-installing-react-native/) if not already installed.
```shell
  brew install watchman
  brew install flow
  npm install -g react-native-cli
```
# How to Publish

A [good description of all the instructions](https://android.jlelse.eu/the-complete-guide-to-creating-an-android-library-46628b7fc879#.cso1a87uy). *TL;DR:* To publish an update to go Android Studio > Gradle right side tab > android > upload > uploadArchives.

Go to [Sonatype](https://oss.sonatype.org/#stagingRepositories) (login account connectedlab) to manage and publish the repository [as described in their docs](http://central.sonatype.org/pages/releasing-the-deployment.html). *TL;DR* Click Close and then Release.



