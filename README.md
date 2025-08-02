# MusiRecommend

MusiRecommend is a Java application that retrieves music information from the Spotify API.

## Features

*   Fetches track information from the Spotify API.
*   Uses a `.env` file for secure handling of API credentials.
*   Demonstrates the use of the Spotify Web API Java library.

## Technologies Used

*   Java
*   Maven
*   Spotify Web API Java
*   dotenv-java
*   Gson
*   OkHttp

## Setup and Installation

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/MusiRecommend.git
    ```
2.  **Create a `.env` file:**
    Create a file named `.env` in the `src/main/resources` directory with the following content:
    ```
    CLIENT_ID=your_spotify_client_id
    CLIENT_SECRET=your_spotify_client_secret
    ```
    You can get your `CLIENT_ID` and `CLIENT_SECRET` from the [Spotify Developer Dashboard](https://developer.spotify.com/dashboard/applications).

3.  **Install dependencies:**
    ```bash
    mvn install
    ```

## Usage

To run the application, execute the following command:

```bash
mvn exec:java
```