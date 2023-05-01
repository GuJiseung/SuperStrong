.class public final Lv4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv4/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/w$a;
    }
.end annotation


# instance fields
.field public final b:Lv4/u;

.field public c:Ly4/i;

.field public final d:Lv4/x;

.field public final e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lv4/u;Lv4/x;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/w;->b:Lv4/u;

    iput-object p2, p0, Lv4/w;->d:Lv4/x;

    iput-boolean p3, p0, Lv4/w;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lv4/b0;
    .locals 12

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv4/w;->b:Lv4/u;

    .line 7
    .line 8
    iget-object v2, v0, Lv4/u;->e:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    new-instance v2, Lz4/i;

    .line 14
    .line 15
    invoke-direct {v2, v0}, Lz4/i;-><init>(Lv4/u;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    new-instance v2, Lz4/a;

    .line 22
    .line 23
    iget-object v3, v0, Lv4/u;->i:Lv4/j$a;

    .line 24
    .line 25
    invoke-direct {v2, v3}, Lz4/a;-><init>(Lv4/j$a;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    new-instance v2, Lx4/a;

    .line 32
    .line 33
    invoke-direct {v2}, Lx4/a;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance v2, Ly4/a;

    .line 40
    .line 41
    invoke-direct {v2}, Ly4/a;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    iget-boolean v2, p0, Lv4/w;->e:Z

    .line 48
    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    iget-object v3, v0, Lv4/u;->f:Ljava/util/List;

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    :cond_0
    new-instance v3, Lz4/b;

    .line 57
    .line 58
    invoke-direct {v3, v2}, Lz4/b;-><init>(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    new-instance v10, Lz4/f;

    .line 65
    .line 66
    iget-object v2, p0, Lv4/w;->c:Ly4/i;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    iget-object v11, p0, Lv4/w;->d:Lv4/x;

    .line 71
    .line 72
    iget v7, v0, Lv4/u;->u:I

    .line 73
    .line 74
    iget v8, v0, Lv4/u;->v:I

    .line 75
    .line 76
    iget v9, v0, Lv4/u;->w:I

    .line 77
    .line 78
    move-object v0, v10

    .line 79
    move-object v5, v11

    .line 80
    move-object v6, p0

    .line 81
    invoke-direct/range {v0 .. v9}, Lz4/f;-><init>(Ljava/util/List;Ly4/i;Ly4/c;ILv4/x;Lv4/d;III)V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    :try_start_0
    invoke-virtual {v10, v11}, Lz4/f;->a(Lv4/x;)Lv4/b0;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p0, Lv4/w;->c:Ly4/i;

    .line 90
    .line 91
    iget-object v3, v2, Ly4/i;->b:Ly4/f;

    .line 92
    .line 93
    monitor-enter v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 94
    :try_start_1
    iget-boolean v2, v2, Ly4/i;->m:Z

    .line 95
    .line 96
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    if-nez v2, :cond_1

    .line 98
    .line 99
    iget-object v2, p0, Lv4/w;->c:Ly4/i;

    .line 100
    .line 101
    invoke-virtual {v2, v0}, Ly4/i;->e(Ljava/io/IOException;)Ljava/io/IOException;

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_1
    :try_start_2
    invoke-static {v1}, Lw4/e;->b(Ljava/io/Closeable;)V

    .line 106
    .line 107
    .line 108
    new-instance v1, Ljava/io/IOException;

    .line 109
    .line 110
    const-string v2, "Canceled"

    .line 111
    .line 112
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 116
    :catchall_0
    move-exception v1

    .line 117
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 118
    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 119
    :catch_0
    move-exception v1

    .line 120
    goto :goto_0

    .line 121
    :catchall_1
    move-exception v1

    .line 122
    const/4 v2, 0x0

    .line 123
    goto :goto_1

    .line 124
    :goto_0
    :try_start_5
    iget-object v2, p0, Lv4/w;->c:Ly4/i;

    .line 125
    .line 126
    invoke-virtual {v2, v1}, Ly4/i;->e(Ljava/io/IOException;)Ljava/io/IOException;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 131
    :catchall_2
    move-exception v1

    .line 132
    const/4 v2, 0x1

    .line 133
    :goto_1
    if-nez v2, :cond_2

    .line 134
    .line 135
    iget-object v2, p0, Lv4/w;->c:Ly4/i;

    .line 136
    .line 137
    invoke-virtual {v2, v0}, Ly4/i;->e(Ljava/io/IOException;)Ljava/io/IOException;

    .line 138
    .line 139
    .line 140
    :cond_2
    throw v1
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv4/w;->c:Ly4/i;

    .line 7
    .line 8
    iget-object v2, v1, Ly4/i;->b:Ly4/f;

    .line 9
    .line 10
    monitor-enter v2

    .line 11
    :try_start_0
    iget-boolean v1, v1, Ly4/i;->m:Z

    .line 12
    .line 13
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const-string v1, "canceled "

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, ""

    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-boolean v1, p0, Lv4/w;->e:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const-string v1, "web socket"

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const-string v1, "call"

    .line 32
    .line 33
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, " to "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lv4/w;->d:Lv4/x;

    .line 42
    .line 43
    iget-object v1, v1, Lv4/x;->a:Lv4/q;

    .line 44
    .line 45
    invoke-virtual {v1}, Lv4/q;->n()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw v0
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final clone()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lv4/w;

    iget-object v1, p0, Lv4/w;->b:Lv4/u;

    iget-object v2, p0, Lv4/w;->d:Lv4/x;

    iget-boolean v3, p0, Lv4/w;->e:Z

    invoke-direct {v0, v1, v2, v3}, Lv4/w;-><init>(Lv4/u;Lv4/x;Z)V

    new-instance v2, Ly4/i;

    invoke-direct {v2, v1, v0}, Ly4/i;-><init>(Lv4/u;Lv4/w;)V

    iput-object v2, v0, Lv4/w;->c:Ly4/i;

    return-object v0
.end method
