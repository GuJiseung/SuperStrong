.class public final Ly4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv4/r;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz4/f;)Lv4/b0;
    .locals 14

    .line 1
    iget-object v0, p1, Lz4/f;->e:Lv4/x;

    .line 2
    .line 3
    iget-object v7, p1, Lz4/f;->b:Ly4/i;

    .line 4
    .line 5
    iget-object v1, v0, Lv4/x;->b:Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "GET"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    xor-int/lit8 v13, v1, 0x1

    .line 15
    .line 16
    iget-object v1, v7, Ly4/i;->b:Ly4/f;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    iget-boolean v3, v7, Ly4/i;->o:Z

    .line 20
    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    iget-object v3, v7, Ly4/i;->j:Ly4/c;

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 28
    iget-object v1, v7, Ly4/i;->h:Ly4/d;

    .line 29
    .line 30
    iget-object v3, v7, Ly4/i;->a:Lv4/u;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget v9, p1, Lz4/f;->g:I

    .line 36
    .line 37
    iget v10, p1, Lz4/f;->h:I

    .line 38
    .line 39
    iget v11, p1, Lz4/f;->i:I

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-boolean v12, v3, Lv4/u;->t:Z

    .line 45
    .line 46
    move-object v8, v1

    .line 47
    :try_start_1
    invoke-virtual/range {v8 .. v13}, Ly4/d;->b(IIIZZ)Ly4/e;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4, v3, p1}, Ly4/e;->g(Lv4/u;Lz4/f;)Lz4/c;

    .line 52
    .line 53
    .line 54
    move-result-object v6
    :try_end_1
    .catch Ly4/g; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 55
    new-instance v8, Ly4/c;

    .line 56
    .line 57
    iget-object v3, v7, Ly4/i;->c:Lv4/d;

    .line 58
    .line 59
    iget-object v4, v7, Ly4/i;->d:Lv4/m;

    .line 60
    .line 61
    iget-object v5, v7, Ly4/i;->h:Ly4/d;

    .line 62
    .line 63
    move-object v1, v8

    .line 64
    move-object v2, v7

    .line 65
    invoke-direct/range {v1 .. v6}, Ly4/c;-><init>(Ly4/i;Lv4/d;Lv4/m;Ly4/d;Lz4/c;)V

    .line 66
    .line 67
    .line 68
    iget-object v3, v7, Ly4/i;->b:Ly4/f;

    .line 69
    .line 70
    monitor-enter v3

    .line 71
    :try_start_2
    iput-object v8, v7, Ly4/i;->j:Ly4/c;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    iput-boolean v1, v7, Ly4/i;->k:Z

    .line 75
    .line 76
    iput-boolean v1, v7, Ly4/i;->l:Z

    .line 77
    .line 78
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    invoke-virtual {p1, v0, v7, v8}, Lz4/f;->b(Lv4/x;Ly4/i;Ly4/c;)Lv4/b0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 86
    throw p1

    .line 87
    :catch_0
    move-exception p1

    .line 88
    goto :goto_0

    .line 89
    :catch_1
    move-exception p1

    .line 90
    goto :goto_1

    .line 91
    :goto_0
    iget-object v0, v1, Ly4/d;->c:Ly4/f;

    .line 92
    .line 93
    monitor-enter v0

    .line 94
    :try_start_4
    iput-boolean v2, v1, Ly4/d;->h:Z

    .line 95
    .line 96
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 97
    new-instance v0, Ly4/g;

    .line 98
    .line 99
    invoke-direct {v0, p1}, Ly4/g;-><init>(Ljava/io/IOException;)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :catchall_1
    move-exception p1

    .line 104
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 105
    throw p1

    .line 106
    :goto_1
    iget-object v0, v1, Ly4/d;->c:Ly4/f;

    .line 107
    .line 108
    monitor-enter v0

    .line 109
    :try_start_6
    iput-boolean v2, v1, Ly4/d;->h:Z

    .line 110
    .line 111
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 112
    throw p1

    .line 113
    :catchall_2
    move-exception p1

    .line 114
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 115
    throw p1

    .line 116
    :cond_0
    :try_start_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 119
    .line 120
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    const-string v0, "released"

    .line 127
    .line 128
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :catchall_3
    move-exception p1

    .line 133
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 134
    throw p1
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
.end method
