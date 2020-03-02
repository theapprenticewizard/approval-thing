import React from 'react'
import "./application.table.css"

const ApplicationTable = ({ title, applications }) => {

    return (
        <div>
            <h2>{title}</h2>
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Score</th>
                    </tr>
                </thead>
                <tbody>
                {applications.map(({name, score}) => {
                    return (
                        <tr key={name}>
                            <td>{name}</td>
                            <td>{score}</td>
                        </tr>
                    )
                })}
                </tbody>
            </table>
        </div>
    )
};

export default ApplicationTable;