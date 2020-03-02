import React, { useEffect, useState } from 'react';
import { useToasts } from "react-toast-notifications";
import ApplicationTable from "./components/application.table/application.table";
import ApplicationForm from "./components/application.form/application.form";

const App = () => {

    const [applications, setApplications] = useState([]);
    const [loading, setLoading] = useState(true);

    const { addToast } = useToasts();

    const handleSubmission = (values) => {
        setApplications([...applications, values]);
        fetch('/applications', {
            method: 'POST',
            body: JSON.stringify(values),
            headers: {
                'Content-Type' : 'application/json'
            }
        })
            .then((response) => {
                if(response.ok) {
                    addToast(`${values.name} was added`, { appearance: 'success', autoDismiss: true})
                } else {
                    setApplications(applications);
                    addToast("Update failed...", { appearance: 'error', autoDismiss: true});
                }

            })
            .catch(() => addToast("Update failed...", { appearance: 'error', autoDismiss: true}))
    };

    useEffect( () => {
            fetch("/applications")
                .then((response) => {
                    if(response.ok) {
                        response.json()
                            .then(json => {
                                setApplications(json);
                                setLoading(false)
                            })
                    } else {
                        addToast("Couldn't Load", { appearance: 'error', autoDismiss: true})
                    }
                })
                .catch(() => {
                    addToast("Couldn't Load", { appearance: 'error', autoDismiss: true})
                });

    }, [addToast]);

    return (
        <div>
            {loading ? <div id="loading"/> : (
                <>
                    <ApplicationTable title="Applications" applications={applications} handleSubmit={handleSubmission}/>
                    <ApplicationForm submitApplication={handleSubmission} />
                </>
            )}
        </div>
    );
};

export default App;
