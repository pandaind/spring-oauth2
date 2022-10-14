OAuth 2.0 is Open Authorization allow website to access resources hosted by other application.
OAuth 2.0 is authorization protocol not authentication protocol. Authentication comes when you add OpenID with it. OAuth 2 + Open ID is complete authentication and authorization together.
Grants access to certain or set of resources.
It uses Access Tokens.

## OAuth 2 Roles
- Resource Owner - user or system owns resource and grant access.
- Client - System that requires access to the protected resources.
- Authorization Server - receives request from the client for access token and issues them on successful authentication and consent by Resource Owner. 
- Resource Server - Server that protects the user's resource . It accepts and validates the access token from client and returns appropriate resource back.

## OAuth Scopes
- What you are allowed to access.


![[Abstract Flow.png]]

[OAuth 2.0 Playground](https://www.oauth.com/playground/)

