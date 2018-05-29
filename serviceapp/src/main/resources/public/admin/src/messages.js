import React from 'react';
import { List, Edit, Create, Datagrid, ReferenceField, TextField, EditButton, DisabledInput, LongTextInput, ReferenceInput, SelectInput, SimpleForm, TextInput } from 'react-admin';

export const MessageList = (props) => (
    <List {...props}>
        <Datagrid>
            <TextField source="id" />
            <TextField source="message" />
        </Datagrid>
    </List>
);

export const MessageCreate = (props) => (
    <Create {...props}>
        <SimpleForm>
            <TextInput source="message" />
        </SimpleForm>
    </Create>
);
