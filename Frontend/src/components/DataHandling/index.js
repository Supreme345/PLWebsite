import React, { useState, useEffect } from 'react';
import axios from 'axios';
import "./index.scss";

const DataHandling = () => {
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [playerData, setPlayerData] = useState([]);

  useEffect(() => {
    const params = new URLSearchParams(window.location.search);
    const teamValue = params.get('team');

    if (teamValue) {
      axios.get(`http://localhost:8081/api/data?team=${encodeURIComponent(teamValue)}`)
        .then(response => {
          setPlayerData(response.data);
          setLoading(false);
        })
        .catch(error => {
          setError(error);
          setLoading(false);
        });
    } else {
      setLoading(false);
    }
  }, []);

  if (loading) {
    return <p>Loading...</p>;
  }

  if (error) {
    return <p>Error: {error.message}</p>;
  }

  return (
    <div className="table-container">
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Position</th>
            <th>Age</th>
            <th>Matches Played</th>
            <th>Starts</th>
            <th>Minutes Played</th>
            <th>Goals</th>
            <th>Assists</th>
            <th>Penalties Kicked</th>
            <th>Yellow Cards</th>
            <th>Red Cards</th>
            <th>Expected Goals (xG)</th>
            <th>Expected Assists (xAG)</th>
            <th>Team</th>
          </tr>
        </thead>
        <tbody>
          {playerData.map(player => (
            <tr key={player.player}>
              <td>{player.player}</td>
              <td>{player.position}</td>
              <td>{player.age}</td>
              <td>{player.matchesPlayed}</td>
              <td>{player.starts}</td>
              <td>{player.minutes}</td>
              <td>{player.goals}</td>
              <td>{player.assists}</td>
              <td>{player.penalties}</td>
              <td>{player.yellowCards}</td>
              <td>{player.redCards}</td>
              <td>{player.expectedGoals}</td>
              <td>{player.expectedAssists}</td>
              <td>{player.team}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default DataHandling;
