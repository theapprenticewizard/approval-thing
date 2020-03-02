import React from "react";
import { useForm } from 'react-hook-form';

const ApplicationForm = ({ submitApplication }) => {
    const { handleSubmit, register, errors } = useForm();

    return (
        <form onSubmit={handleSubmit(submitApplication)}>
            <label htmlFor="name">Name: </label>
            <input
                name="name"
                ref={register({
                    required: 'Required'
                })}
            />
            {errors.name && errors.name.message}

            <label htmlFor="score">Score: </label>
            <input
                name="score"
                ref={register({
                    required: 'Required'
                })}
            />
            {errors.score && errors.score.message}

            <button type="submit">Submit</button>
        </form>
    )
};

export default ApplicationForm;