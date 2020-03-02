import React, { useEffect, useState } from 'react';
import ApplicationTable from "./components/application.table/application.table";

function App() {

    const [applications, setApplications] = useState([]);

    useEffect( () => {
        async function doFetch() {
            const response = await fetch("/applications");
            const json = await response.json();
            console.log(JSON.stringify(json));
            setApplications(json)
        }
        doFetch().then(r => console.log("completed fetch..."));
    }, []);

    return (
        <div>
            <ApplicationTable title="Applications" applications={applications}/>
        </div>
    );
}

export default App;
