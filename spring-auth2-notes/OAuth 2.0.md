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

-   _Resource_: Any kind of information that can only be retrieved by authorized clients
-   _Client_: an application that consumes a resource, usually through a REST API
-   _Resource Server_: A service that is responsible for serving a resource to authorized clients
-   _Resource Owner_: entity (human or application) that owns a resource and, ultimately, is responsible for granting access to it to a client
-   _Token_: a piece of information got by a client and sent to a resource server as part of the request to authenticate it
-   _Identity Provider (IdP)_: Validates user credentials and issues access tokens to clients.
-   _Authentication Flow:_ Sequence of steps a client must go through to get a valid token.


Below mentioned are the five key OAuth grant types for a user acquiring (or requesting to acquiring) a token.
-   **Authorization:** It permits direct login using the 3rd resource. There is no need to provide the username or other login credentials.
-   **Implicit:** It won’t ask for any kind of code. Rather, the client app gets an access token soon after the user’s consent.
-   **Resource owner credentials:** It involves verification of token validity by the resource server. If valid, the user data will respond to it according to the pre-defined scope.
-   **Client credentials**: Useful in situations requiring to obtain a token for a scenario that falls outside the user’s context. Only the client uses it.
-   **Refresh token:** It is useful when accessing as app needs a renewed token.